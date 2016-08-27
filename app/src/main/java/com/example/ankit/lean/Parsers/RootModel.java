import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public String type;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public String state;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String privacy;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String start_time;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String description;
	public String email;
	public String schedule_published_on;
	public VersionModel _version;
	public String timezone;

	public RootModel(CreatorModel creator, String location_name, String type, String organizer_name, String organizer_description, String code_of_conduct, String state, int id, Call_for_papersModel call_for_papers, String name, String privacy, String topic, CopyrightModel copyright, String logo, String start_time, String background_image, ArrayList<Social_linksModel> social_links, String end_time, String description, String email, String schedule_published_on, VersionModel version, String timezone) {

		this._creator = creator;
		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.privacy = privacy;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.start_time = start_time;
		this.background_image = background_image;
		this.social_links = social_links;
		this.end_time = end_time;
		this.description = description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.timezone = timezone;

	}

}