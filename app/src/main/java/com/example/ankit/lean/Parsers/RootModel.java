import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String code_of_conduct;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String name;
	public String type;
	public VersionModel _version;
	public String location_name;
	public int id;
	public String background_image;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public String email;
	public String organizer_description;

	public RootModel(String end_time, String logo, String code_of_conduct, String schedule_published_on, ArrayList<Social_linksModel> social_links, String state, String name, String type, VersionModel version, String location_name, int id, String background_image, String organizer_name, String description, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String privacy, CopyrightModel copyright, String timezone, String start_time, String email, String organizer_description) {

		this.end_time = end_time;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.state = state;
		this.name = name;
		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this.organizer_description = organizer_description;

	}

}