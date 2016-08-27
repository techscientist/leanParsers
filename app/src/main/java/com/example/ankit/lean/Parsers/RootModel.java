import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String state;
	public String type;
	public String organizer_name;
	public String end_time;
	public String start_time;
	public String name;
	public String description;
	public String organizer_description;
	public String timezone;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public int id;
	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String state, String type, String organizer_name, String end_time, String start_time, String name, String description, String organizer_description, String timezone, String privacy, Call_for_papersModel call_for_papers, String background_image, String email, CopyrightModel copyright, String logo, int id, String code_of_conduct, String topic, String schedule_published_on, ArrayList<Social_linksModel> social_links, String location_name, VersionModel version) {

		this._creator = creator;
		this.state = state;
		this.type = type;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.location_name = location_name;
		this._version = version;

	}

}