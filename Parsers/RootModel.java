import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String location_name;
	public String description;
	public String name;
	public String timezone;
	public String state;
	public CopyrightModel _copyright;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String email;
	public String logo;

	public RootModel(Call_for_papersModel call_for_papers, int id, String location_name, String description, String name, String timezone, String state, CopyrightModel copyright, String background_image, ArrayList<Social_linksModel> social_links, String type, VersionModel version, String end_time, String organizer_name, String code_of_conduct, String schedule_published_on, String privacy, String start_time, CreatorModel creator, String organizer_description, String topic, String email, String logo) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.location_name = location_name;
		this.description = description;
		this.name = name;
		this.timezone = timezone;
		this.state = state;
		this._copyright = copyright;
		this.background_image = background_image;
		this.social_links = social_links;
		this.type = type;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.email = email;
		this.logo = logo;

	}

}