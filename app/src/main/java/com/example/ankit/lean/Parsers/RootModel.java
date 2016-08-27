import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String end_time;
	public String description;
	public String type;
	public String organizer_description;
	public String email;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;
	public String privacy;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public int id;
	public String background_image;
	public String start_time;
	public String name;
	public String logo;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String end_time, String description, String type, String organizer_description, String email, CreatorModel creator, String code_of_conduct, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, String state, VersionModel version, String privacy, String topic, CopyrightModel copyright, String timezone, int id, String background_image, String start_time, String name, String logo) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;
		this.email = email;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this.state = state;
		this._version = version;
		this.privacy = privacy;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this.id = id;
		this.background_image = background_image;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;

	}

}