import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String start_time;
	public String background_image;
	public String end_time;
	public String type;
	public String email;
	public CopyrightModel _copyright;
	public int id;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public String state;
	public VersionModel _version;
	public String organizer_description;
	public String name;
	public String timezone;
	public String location_name;

	public RootModel(Call_for_papersModel call_for_papers, String topic, String organizer_name, CreatorModel creator, String code_of_conduct, ArrayList<Social_linksModel> social_links, String description, String start_time, String background_image, String end_time, String type, String email, CopyrightModel copyright, int id, String schedule_published_on, String logo, String privacy, String state, VersionModel version, String organizer_description, String name, String timezone, String location_name) {

		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.end_time = end_time;
		this.type = type;
		this.email = email;
		this._copyright = copyright;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;
		this._version = version;
		this.organizer_description = organizer_description;
		this.name = name;
		this.timezone = timezone;
		this.location_name = location_name;

	}

}